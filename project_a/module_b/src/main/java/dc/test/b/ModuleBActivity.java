package dc.test.b;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * @author senrsl
 * @ClassName: ModuleBActivity
 * @Package: dc.test.b
 * @CreateTime: 2020/11/2 2:54 PM
 */
public class ModuleBActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText(getClass().getSimpleName());
        setContentView(tv);
    }
}
