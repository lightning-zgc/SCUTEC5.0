import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.mapreduce.Partitioner;

/**
 * Created by mac on 2017/3/1.
 */
public class CityPartitioner extends Partitioner<CityBean, LongWritable> {
    @Override
    public int getPartition(CityBean cityBean, LongWritable longWritable, int i) {
        return (int) (cityBean.getProvienceId() % 2);
    }
}
