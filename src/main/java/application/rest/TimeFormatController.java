package application.rest;

import application.timeformat.TimeFormatConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Alexander on 11.02.2018.
 */
@RestController
public class TimeFormatController {

    @Autowired
    private TimeFormatConverter timeFormatConverter;

    @RequestMapping(value="/UTCOffset", method= RequestMethod.GET)
    public String getUTCOffset(@RequestParam(value="IANA") String iana) {
        return timeFormatConverter.convert(iana);
    }
}
