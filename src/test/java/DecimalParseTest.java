import com.ibm.icu.math.BigDecimal;
import com.ibm.icu.text.DecimalFormat;
import org.junit.Test;

import java.text.ParseException;
import java.util.Locale;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class DecimalParseTest {

    @Test
    public void parse() {
        DecimalFormat parser = (DecimalFormat) DecimalFormat.getInstance(Locale.US);
        parser.setParseBigDecimal(true);

        try {
            BigDecimal decimal = (BigDecimal) parser.parse("0.0");
            assertEquals(new BigDecimal("0.0"), decimal);
        } catch (ParseException e) {
            fail("Parse 0.0 should have succeeded.");
        }
    }
}
