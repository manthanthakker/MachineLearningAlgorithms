package clustering;

import CustomDataTypes.Dataset;
import CustomDataTypes.Model;

public interface MLInterface {
    Model train(Dataset training, Dataset testing);
}
