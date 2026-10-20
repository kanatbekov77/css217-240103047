
interface DigitalGame {
    void playDigital();
}

class ModernConsole {
    public void playGame(DigitalGame game) {
        game.playDigital();
    }
}

class RetroCartridge {
    public void insertCartridge() {
        System.out.println("Playing retro game from cartridge!");
    }
}

class CartridgeAdapter implements DigitalGame {
    private RetroCartridge cartridge;

    public CartridgeAdapter(RetroCartridge cartridge) {
        this.cartridge = cartridge;
    }

    public void playDigital() {
        cartridge.insertCartridge();
    }
}

public class AdapterPatternMain {
    public static void main(String[] args) {
        ModernConsole console = new ModernConsole();

        RetroCartridge retroGame = new RetroCartridge();

        DigitalGame adapter = new CartridgeAdapter(retroGame);

        console.playGame(adapter);
    }
}
