import org.apache.hadoop.io.Writable;
import org.apache.hadoop.io.WritableComparable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * Created by mac on 2017/3/1.
 */
public class CityBean implements WritableComparable<CityBean> {
    private Long provienceId;
    private String provienceName;
    private Long gdp;
    private Long population;

    public CityBean() {

    }

    public CityBean(Long provienceId, String provienceName, Long gdp, Long population) {
        this.provienceId = provienceId;
        this.provienceName = provienceName;
        this.gdp = gdp;
        this.population = population;
    }

    public void readFields(DataInput dataInput) throws IOException {
        provienceId = dataInput.readLong();
        provienceName = dataInput.readUTF();
        gdp = dataInput.readLong();
        population = dataInput.readLong();
    }

    public void write(DataOutput dataOutput) throws IOException {
        dataOutput.writeLong(provienceId);
        dataOutput.writeUTF(provienceName);
        dataOutput.writeLong(gdp);
        dataOutput.writeLong(population);
    }

    public Long getProvienceId() {
        return provienceId;
    }

    public String getProvienceName() {
        return provienceName;
    }

    public Long getGDP() {
        return gdp;
    }

    public Long getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return provienceId + "\t" + provienceName + "\t" + gdp + "\t" + population;
    }

    public int compareTo(CityBean o) {
        return 0;
    }
}
