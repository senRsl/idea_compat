package dc.test.o;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;
import dc.test.p.ModulePActivity;
import dc.test.q.ModuleQActivity;

/**
 * @author senrsl
 * @ClassName: ProjectOActivity
 * @Package: dc.test.o
 * @CreateTime: 2020/11/2 2:48 PM
 */
public class ProjectOActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText(getClass().getSimpleName());
        setContentView(tv);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(ProjectOActivity.this, ModulePActivity.class));
            }
        }, 1000);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(ProjectOActivity.this, ModuleQActivity.class));
            }
        }, 2000);
    }

}
