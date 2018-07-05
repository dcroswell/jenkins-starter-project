package utilities

import java.util.logging.Logger

class MyUtilities {
    static void addMyFeature(def job) {
        job.with {
            description('Arbitrary feature')
        }
    }

    static void logInfo(def msg){
        private static final Logger LOGGER = Logger.getLogger(MyUtilities.class.getName());
        LOGGER.info("${msg}")
        echo "[INFO] ${msg}" <-- gives me an exception described below
    }
}