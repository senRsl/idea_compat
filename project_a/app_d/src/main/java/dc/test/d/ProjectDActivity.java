package dc.test.d;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;
import dc.test.b.ModuleBActivity;
import dc.test.c.ModuleCActivity;

/**
 * @author senrsl
 * @ClassName: ProjectDActivity
 * @Package: dc.test.d
 * @CreateTime: 2020/11/2 2:48 PM
 */
public class ProjectDActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText(getClass().getSimpleName());
        setContentView(tv);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(ProjectDActivity.this, ModuleBActivity.class));
            }
        }, 1000);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(ProjectDActivity.this, ModuleCActivity.class));
            }
        }, 2000);
    }
}
