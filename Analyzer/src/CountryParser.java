import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static java.util.Arrays.asList;

/**
 * Created by Abuser on 5/2/2017.
 */
public class CountryParser implements Parser {
    @Override
    public String parse(String line) {
        // License key doesn't work for WebServiceClient, so I randomly generate countries for now

//        Pattern p = Pattern.compile("(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)");
//        Matcher m = p.matcher(line);
//
//        if (!m.find())
//            return null;
//
//        String ip = m.group(0);
//
//        try (WebServiceClient client = new WebServiceClient.Builder(42, "license_key")
//                .build()) {
//            InetAddress ipAddress = InetAddress.getByName(ip);
//
//            // Do the lookup
//            CountryResponse response = client.country(ipAddress);
//            Country country = response.getCountry();
//
//            return country.getName();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (GeoIp2Exception e) {
//            e.printStackTrace();
//        }
//
//        return null;

        List<String> countries = new ArrayList<>(asList("S. Korea", "Israel", "US", "India", "Brazil"));
        int randomNum = ThreadLocalRandom.current().nextInt(0,  5 );

        return countries.get(randomNum);
    }

    @Override
    public String getName() {
        return "Country";
    }
}
