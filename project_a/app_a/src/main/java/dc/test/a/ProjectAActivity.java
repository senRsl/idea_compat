package dc.test.a;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;
import dc.test.b.ModuleBActivity;

/**
 * @author senrsl
 * @ClassName: ProjectAActivity
 * @Package: dc.test.a
 * @CreateTime: 2020/11/2 2:48 PM
 */
public class ProjectAActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText(getClass().getSimpleName());
        setContentView(tv);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(ProjectAActivity.this, ModuleBActivity.class));
            }
        }, 1000);
    }

}
