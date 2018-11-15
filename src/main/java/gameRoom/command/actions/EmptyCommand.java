package gameRoom.command.actions;

import gameRoom.command.ActionCommand;

import javax.servlet.http.HttpServletRequest;

public class EmptyCommand implements ActionCommand {

        @Override
        public String execute(HttpServletRequest request) {
        return "/login.jsp";
    }
}
