package utilities

import java.util.logging.Logger

class MyUtilities {
    static void addMyFeature(def job) {
        job.with {
            description('Arbitrary feature')
        }
    }
}

class Output {
    private static final Logger LOGGER = Logger.getLogger(Output.class.getName());

    def info(msg){
        LOGGER.info("${msg}")
        echo "[INFO] ${msg}" <-- gives me an exception described below
    }
}