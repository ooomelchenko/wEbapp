package gameRoom.command.actions;

import gameRoom.command.ActionCommand;

import javax.servlet.http.HttpServletRequest;

public class WellcomeCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest request) {
        return "/Wellcome.jsp";
    }
}
