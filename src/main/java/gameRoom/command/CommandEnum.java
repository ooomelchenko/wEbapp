package gameRoom.command;

import gameRoom.command.actions.FilterToys;
import gameRoom.command.actions.LoginCommand;
import gameRoom.command.actions.LogoutCommand;
import gameRoom.command.actions.SortToysByPrice;

public enum CommandEnum {
    LOGIN {
        {
            this.command = new LoginCommand();
        }
    },
    LOGOUT {
        {
            this.command = new LogoutCommand();
        }
    },
    SORTBYPRICE {
        {
            this.command = new SortToysByPrice();
        }
    },
    FILTERTOYS {
        {
            this.command = new FilterToys();
        }
    };

    ActionCommand command;
    public ActionCommand getCurrentCommand() {
        return command;
    }
}
