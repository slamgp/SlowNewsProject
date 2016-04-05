package services;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import model.Article;
import model.rss.CNN;
import model.rss.Item;

public class NewsCreator {
	
	public List<Article> createTestDate() {
		List<Article> news = new ArrayList<Article>();
		news.add(new Article("images/346257.jpg", "Реванш Кличко и Фьюри пройдет в Англии в июле", 
				"	Если верить словам тренеру и дяде британского боксера Питера Фьюри, "
				+ " то дата и место проведения боя между Тайсоном Фьюри и Владимир Кличко - это уже вопрос решенный."
				+ " В настоящий момент наиболее вероятной датой является июль, и я надеюсь, что бой пройдет в Англии."
				+ " Мик Хеннесси работает с командой Кличко круглосуточно. Кличко готовы приехать в Англию. Думаю, в апреле об этом объявим официально"
				+ ", - цитирует слова Питера Фьюри The Telegraph."
				+ " По данным издания переговоры между сторонами боксеров затянулись,"
                + " потому что им нужно было найти такую дату, которая бы устроила три телеканала - HBOm Sky и RTL."
	            + " Напомним, что в ноябре 2015-года Фьюри победил Кличко решением судьев, отобрав у украинца пояса WBO,"
	            + " IBF, WBA и IBO в супертяжелом весе."));
		news.add(new Article("images/346300.jpg", "Ковалев: Уорд может драться еще лучше", 
				"Мой прогноз на бой Уорда и Барреры полностью сбылся. Я ожидал, что Уорд легко победит... "
				+ "Правда, я думал, что он сделает это досрочно, но Баррера выступил лучше, чем я предполагал."
				+ " Я рад, что Уорд победил, так как это еще один шаг на пути моего боя с ним этой осенью в США. "
				+ "Теперь мне необходимо выиграть свой следующий бой, — сказал Ковалев. "
                + " Я понимаю, что большинство людей не очень хотят видеть меня здесь, так как я хочу побить Уорда перед его же поклонниками. "
                + " Но это не будет просто. Я буду продолжать тренироваться, "
                + " чтобы победить его стиль, — продолжил Чемпион мира по версиям WBA (Super)/WBO (Super)/IBF в полутяжелом весе."  
                + " Напомним, что сегодня экс-чемпион мира во втором среднем весе Андре Уорд одержал победу над кубинцем Салливаном Баррерой."));
		news.add(new Article("images/346289.jpg", "Уорд уверенно победил Барреру", 
				"От первой минуты боксерский поединок проходил при явном доминировании Уорда, "
				+ "а в третьем раунде он и вовсе отправил своего соперника в нокдаун."
				+ "	Отметим, что в восьмом раунде с амриканца сняли одно очко за нарушение правил, а точнее за удар ниже пояса."
				+ " В итоге судьба боя была в руках судей, которые без сомнений отдали победу Андре Уорду: 117:108, 117:109 и 118:109."));
		return news;
	}
	
	public List <Article> createRSSDate() {
		List <Article>result = new ArrayList<Article>();
		try {
			System.out.println("start");
			URL snnUrl = new URL("http://rss.cnn.com/rss/edition.rss");
			JAXBContext jaxbContext = JAXBContext.newInstance(CNN.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			CNN cnn = (CNN) unmarshaller.unmarshal(snnUrl.openStream());
			System.out.println(cnn);
			System.out.println(cnn.getChannel());
			for(Item it: cnn.getChannel().getItem()) {
				if (!it.getDescription().isEmpty()) {
					result.add(new Article("images/346289.jpg", it.getTitle(), it.getDescription()));
				}
			}
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
}
