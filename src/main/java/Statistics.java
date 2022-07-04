import org.w3c.dom.css.Counter;

public class Statistics {
    private int id;
    private int count;
    private String statName;


    {
        Counter counter = new Counter() {

            @Override
            public String getIdentifier() {
                return null;
            }

            @Override
            public String getListStyle() {
                return null;
            }

            @Override
            public String getSeparator() {
                return null;
            }
        };
    }
}
