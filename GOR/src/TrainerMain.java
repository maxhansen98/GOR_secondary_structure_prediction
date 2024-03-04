import utils.CmdParser;

import java.io.IOException;

public class TrainerMain {
    public static void main(String[] args) throws IOException {
        CmdParser cmd = new CmdParser("--db", "--method", "--model");
        cmd.setMandatoryOpts("--db", "--method", "--model");
        cmd.parse(args);
        String db = cmd.getOptionValue("--db");
        String method = cmd.getOptionValue("--method");
        String model = cmd.getOptionValue("--model");
        System.out.println(db);
        System.out.println(method);
        System.out.println(model);
        Trainer trainer = new Trainer(db);
        System.out.println(trainer.getSearchWindow());
        for (int i = 0; i < trainer.getTrainingSequences().size(); i++) {
            String[] entry = trainer.getTrainingSequences().get(i);
            for (int j = 0; j < entry.length; j++) {
                System.out.println(entry[j]);
            }
        }
        // "/home/malte/projects/blockgruppe3/GOR/CB513DSSP.db"
    }
}