package dc.test.p;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * @author senrsl
 * @ClassName: ModulePActivity
 * @Package: dc.test.p
 * @CreateTime: 2020/11/2 2:54 PM
 */
public class ModulePActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText(getClass().getSimpleName());
        setContentView(tv);
    }
}
