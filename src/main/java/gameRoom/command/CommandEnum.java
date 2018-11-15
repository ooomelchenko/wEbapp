package gameRoom.command;

import gameRoom.command.actions.*;

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
    WELLCOME {
        {
            this.command = new WellcomeCommand();
        }
    },
    GAMEROOM {
        {
            this.command = new GameRoomCommand();
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
