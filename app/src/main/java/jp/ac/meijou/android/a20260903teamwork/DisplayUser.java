package jp.ac.meijou.android.a20260903teamwork;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import jp.ac.meijou.android.a20260903teamwork.databinding.ActivityDisplayPostBinding;
import jp.ac.meijou.android.a20260903teamwork.databinding.ActivityDisplayUserBinding;

public class DisplayUser extends AppCompatActivity {

    private ActivityDisplayUserBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_display_user);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // 他のSNSアカウントへの遷移(IDは仮:IDが決まって、修正した場合はこれを消してください)
//        binding.toXAccountButton.setOnClickListener(view -> {
//            var intent = new Intent();
//            intent.setAction(Intent.ACTION_VIEW);
//            intent.setData(Uri.parse("https://x.com"));
//            startActivity(intent);
//        });
    }
}