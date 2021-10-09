package collections.maps;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Cache {

    public static void main(String[] args) {

        Cache cache = new Cache();
        System.out.println(cache.getCurrency("PLN", "USD", "2021-10-09"));
        System.out.println(cache.getCurrency("PLN", "USD", "2021-10-08"));
        System.out.println(cache.getCurrency("PLN", "USD", "2021-10-07"));
        System.out.println(cache.getCurrency("PLN", "USD", "2021-10-06"));
        System.out.println(cache.getCurrency("PLN", "USD", "2021-10-09"));

        // ....


        System.out.println(cache.getCurrency("PLN", "USD", "2021-10-07"));

    }

    private final Map<CacheKey, CacheValue> cache = new HashMap<>();

    public double getCurrency(String currencyIn, String currencyOut, String date) {

        CacheKey cacheKey = new CacheKey(currencyIn, currencyOut, date);
        CacheValue cacheValue = cache.get(cacheKey);
        if (cacheValue != null) {
            System.out.println("From cache");
            return cacheValue.getCurrency();
        }

        System.out.println("From webAPI");
        // TODO: request to webAPI, get currency, save to cache, and return
        cacheValue = new CacheValue(4.11d);

        cache.put(cacheKey, cacheValue);

        return cacheValue.getCurrency();

    }

    public class CacheKey {

        private String currencyIn;
        private String currencyOut;
        private String date;

        public CacheKey(String currencyIn, String currencyOut, String date) {
            this.currencyIn = currencyIn;
            this.currencyOut = currencyOut;
            this.date = date;
        }

        public String getCurrencyIn() {
            return currencyIn;
        }

        public String getCurrencyOut() {
            return currencyOut;
        }

        public String getDate() {
            return date;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            CacheKey cacheKey = (CacheKey) o;
            return Objects.equals(currencyIn, cacheKey.currencyIn) && Objects.equals(currencyOut, cacheKey.currencyOut) && Objects.equals(date, cacheKey.date);
        }

        @Override
        public int hashCode() {
            return Objects.hash(currencyIn, currencyOut, date);
        }
    }

    public class CacheValue {
        private double currency;

        public CacheValue(double currency) {
            this.currency = currency;
        }

        public double getCurrency() {
            return currency;
        }
    }
}
