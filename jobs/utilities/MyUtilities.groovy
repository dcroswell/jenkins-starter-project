package utilities

import java.util.logging.Logger

class MyUtilities {
    private static final Logger LOGGER = Logger.getLogger(MyUtilities.class.getName());

    static void addMyFeature(def job) {
        job.with {
            description('Arbitrary feature')
        }
    }

    static void logInfo(def msg){
        LOGGER.info("${msg}")
        echo "[INFO] ${msg}" <-- gives me an exception described below
    }
}