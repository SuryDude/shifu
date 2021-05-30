package ml.shifu.shifu.udf;
import ml.shifu.shifu.actor.worker.DataNormalizeWorker;

import ml.shifu.shifu.container.obj.ColumnConfig;
import org.junit.Test;

import java.util.List;

/**
 * EmbeddingNormUDFTest class
 */
public class EmbeddingNormUDFTest {

    @Test
    public void testRandomNormUDF() {

        ColumnConfig columnConfig = new ColumnConfig();
        columnConfig.setBinLength(3);
        List<List<Double>> randomEmbeddingNormVectorColumn = DataNormalizeWorker.getRandomEmbeddingNormVectorColumn(columnConfig);
        System.out.println(randomEmbeddingNormVectorColumn);

        List<Double> sizeTwoEmbeddingNormVector = DataNormalizeWorker.getRandomEmbeddingNormVectorBin(2);
        System.out.println(sizeTwoEmbeddingNormVector);
        List<Double> sizeThreeEmbeddingNormVector = DataNormalizeWorker.getRandomEmbeddingNormVectorBin(3);
        System.out.println(sizeThreeEmbeddingNormVector);
    }

}
