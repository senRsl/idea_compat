package dc.test.j;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * @author senrsl
 * @ClassName: ModuleJActivity
 * @Package: dc.test.j
 * @CreateTime: 2020/11/2 2:54 PM
 */
public class ModuleJActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText(getClass().getSimpleName());
        setContentView(tv);
    }
}
