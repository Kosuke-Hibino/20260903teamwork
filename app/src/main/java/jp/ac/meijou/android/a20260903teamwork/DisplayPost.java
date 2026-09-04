package jp.ac.meijou.android.a20260903teamwork;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import jp.ac.meijou.android.a20260903teamwork.databinding.ActivityCreatePostBinding;
import jp.ac.meijou.android.a20260903teamwork.databinding.ActivityDisplayPostBinding;

public class DisplayPost extends AppCompatActivity {

    private ActivityDisplayPostBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityDisplayPostBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //メニューバーの表示切り替え
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

        //ユーザー表示画面に遷移
        binding.userImage.setOnClickListener(view -> {
            var intent = new Intent(this, DisplayUser.class);
            startActivity(intent);
        });

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

        // ユーザ情報画面への遷移
        binding.userImage.setOnClickListener(view -> {
            var intent = new Intent(this, DisplayUser.class);
            startActivity(intent);
        });

        // 戻る
        binding.buttonMenu1.setOnClickListener(view -> {
            finish();
        });
    }
}