package controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Article;

@WebServlet("/news")
public class NewsServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		List<Article> news = new ArrayList<Article>();
		req.setAttribute("news", news);
		createTestDate(news);
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/view/news.jsp");
		dispatcher.forward(req,resp); 
	}

	private void createTestDate(List<Article> news) {
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
	}

}
