package gameRoom.command.actions;

import gameRoom.command.ActionCommand;

import javax.servlet.http.HttpServletRequest;

public class LogoutCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest request) {
        request.getSession().invalidate();
        return "/logout.jsp";
    }
}
