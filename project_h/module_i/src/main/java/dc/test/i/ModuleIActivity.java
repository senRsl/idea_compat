package dc.test.i;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * @author senrsl
 * @ClassName: ModuleIActivity
 * @Package: dc.test.i
 * @CreateTime: 2020/11/2 2:54 PM
 */
public class ModuleIActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText(getClass().getSimpleName());
        setContentView(tv);
    }
}
