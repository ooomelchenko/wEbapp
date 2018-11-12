package gameRoom.command.actions;

import gameRoom.command.ActionCommand;
import gameRoom.model.enums.AgeGroup;
import gameRoom.model.enums.ChildMale;
import gameRoom.model.services.ToyService;
import gameRoom.model.services.ToyServiceImpl;
import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;

public class EmptyCommand implements ActionCommand {

        @Override
        public String execute(HttpServletRequest request) {
            ToyService toyService = new ToyServiceImpl();

            try {
                request.getSession().setAttribute("toyList", toyService.getAllToys());
                request.getSession().setAttribute("AgeGroup", AgeGroup.values());
                request.getSession().setAttribute("ChildMale", ChildMale.values());

            } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        return "/GameRoom.jsp";
    }
}
