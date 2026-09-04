
package jp.ac.meijou.android.a20260903teamwork;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import jp.ac.meijou.android.a20260903teamwork.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //メニューバーの表示切り替えコピーここから
        binding.buttonMenu2.setOnClickListener(view -> {
            var visibility = binding.menu2.getVisibility();
            if (visibility == 8) {
                binding.menu2.setVisibility(0);
                binding.buttonMenu2.setText("閉じる");
            } else {
                binding.menu2.setVisibility(8);
                binding.buttonMenu2.setText("メニュー");
            }
        });
        //コピーここまで


        // 画面遷移コピペ用

        // ユーザー登録画面に遷移
        binding.buttonMenu3.setOnClickListener(view -> {
            var intent = new Intent(this, UserRegistration.class);
            startActivity(intent);
        });

        // 検索画面に遷移
        binding.buttonMenu4.setOnClickListener(view -> {
            var intent = new Intent(this, SearchResult.class);
            startActivity(intent);
        });

        // 投稿作成画面に遷移
        binding.buttonMenu5.setOnClickListener(view -> {
            var intent = new Intent(this, CreatePost.class);
            startActivity(intent);
        });

        // 戻る
        binding.buttonMenu1.setOnClickListener(view -> {
            finish();
        });

    }
}