package swcs.dp.dip.logger.after;

class Logger {
    private final Loggable loggable;

    Logger(Loggable loggable) {
        this.loggable = loggable;
    }

    public void log(String message) {
        this.loggable.log(message);
    }
}
