package swcs.gof.behavioral.strategy.compression;

import java.util.ArrayList;

class Client {

    public static void main(String[] args) {
        CompressionContext ctx = new CompressionContext();

        // we could assume context is already set by preferences
        ctx.compressionStrategy(new RarCompressionStrategy());

        // get a list of files
        ctx.createArchive(new ArrayList<>());
    }
}
