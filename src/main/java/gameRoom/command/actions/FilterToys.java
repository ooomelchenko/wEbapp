package gameRoom.command.actions;

import gameRoom.command.ActionCommand;
import gameRoom.model.enums.AgeGroup;
import gameRoom.model.enums.ChildMale;
import gameRoom.model.services.ToyService;
import gameRoom.model.services.ToyServiceImpl;

import javax.servlet.http.HttpServletRequest;

public class FilterToys implements ActionCommand {
    @Override
    public String execute(HttpServletRequest request) {

        ToyService toyService = new ToyServiceImpl();

        Long minPrice = null;
        Long maxPrice = null;
        ChildMale childMale = null;
        AgeGroup ageGroup = null;

        if (request.getParameter("minPrice") != null) {
            try {
                minPrice = Long.valueOf(request.getParameter("minPrice"));
            } catch (NumberFormatException e) {

            }
        }
        if (request.getParameter("maxPrice") != null) {
            try {
                maxPrice = Long.valueOf(request.getParameter("maxPrice"));
            } catch (NumberFormatException e) {

            }
        }
        if (request.getParameter("ChildMale") != null) {
            try {
                childMale = ChildMale.valueOf(request.getParameter("ChildMale"));
            } catch (IllegalArgumentException e) {

            }
        }
        if (request.getParameter("AgeGroup") != null) {
            try {
                ageGroup = AgeGroup.valueOf(request.getParameter("AgeGroup"));
            } catch (IllegalArgumentException e) {

            }
        }

        request.getSession().setAttribute("toyList", toyService.getFilteredToys(minPrice, maxPrice, childMale, ageGroup));
        return "/GameRoom.jsp";
    }
}