package gameRoom.command.actions;

import gameRoom.command.ActionCommand;
import gameRoom.model.entity.Toy;
import gameRoom.model.services.ToyService;
import gameRoom.model.services.ToyServiceImpl;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.util.List;

public class SortToysByPrice implements ActionCommand {
    @Override
    public String execute(HttpServletRequest request) {

        ToyService toyService = new ToyServiceImpl();
        List<Toy> toyList = (List<Toy>) request.getSession().getAttribute("toyList");

        try {
            request.getSession().setAttribute("toyList", toyService.getToysSortedByPrice(toyList));
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return "/GameRoom.jsp";
    }
}