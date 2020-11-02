package dc.test.q;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * @author senrsl
 * @ClassName: ModuleQActivity
 * @Package: dc.test.q
 * @CreateTime: 2020/11/2 2:54 PM
 */
public class ModuleQActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText(getClass().getSimpleName());
        setContentView(tv);
    }
}
