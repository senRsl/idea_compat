package dc.test.h;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;
import dc.test.i.ModuleIActivity;
import dc.test.j.ModuleJActivity;

/**
 * @author senrsl
 * @ClassName: ProjectHActivity
 * @Package: dc.test.h
 * @CreateTime: 2020/11/2 2:48 PM
 */
public class ProjectHActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText(getClass().getSimpleName());
        setContentView(tv);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(ProjectHActivity.this, ModuleIActivity.class));
            }
        }, 1000);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(ProjectHActivity.this, ModuleJActivity.class));
            }
        }, 2000);
    }

}
