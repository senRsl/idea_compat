package dc.test.a;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;
import dc.test.b.ModuleBActivity;
import dc.test.i.ModuleIActivity;
import dc.test.j.ModuleJActivity;
import dc.test.p.ModulePActivity;
import dc.test.q.ModuleQActivity;

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

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(ProjectAActivity.this, ModuleIActivity.class));
            }
        }, 2000);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(ProjectAActivity.this, ModuleJActivity.class));
            }
        }, 3000);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(ProjectAActivity.this, ModulePActivity.class));
            }
        }, 4000);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(ProjectAActivity.this, ModuleQActivity.class));
            }
        }, 5000);


    }

}
