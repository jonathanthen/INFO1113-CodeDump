import java.util.List;

public class Search {

    public <T extends Compare> T segSearch(T obj, List<T> lis, int upper, int lower) {
        if (lis == null || lis.length == 0) {
            return null;
        }
        if (obj == null) {
            return null;
        }
        if ((upper < lower) || (upper > lis.length) || (lower < 0)) {
            return null;
        }

        for (int i = lower; i != upper ; i++) {
            if (obj.compareTo(lis.get(i)) == 0) {
                return lis.get(i);
            }
        }
        return null;
    }

}