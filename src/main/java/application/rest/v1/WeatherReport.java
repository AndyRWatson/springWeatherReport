package application.rest.v1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.ArrayList;
import java.util.List;

@RestController
public class WeatherReport {

    @RequestMapping("weatherReport")
    public @ResponseBody ResponseEntity<String> weatherReport() {
        List<String> list = new ArrayList<>();
        //return a simple list of strings
        list.add("location:Hursley");
        list.add("Forecast:Sunny");
        list.add("windSpeed:10");
        return new ResponseEntity<String>(list.toString(), HttpStatus.OK);
    }

}
