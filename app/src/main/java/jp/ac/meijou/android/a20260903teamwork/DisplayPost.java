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
        // ユーザー登録画面への遷移
        binding.userRegistrationButton.setOnClickListener(view -> {
            var intent = new Intent(this, UserRegistration.class);
            startActivity(intent);
        });
        // 検索画面への遷移
        binding.displayPostButton.setOnClickListener(view -> {
            var intent = new Intent(this, SearchResult.class);
            startActivity(intent);
        });
        // 投稿作成画面への遷移
        binding.createPostButton.setOnClickListener(view -> {
            var intent = new Intent(this, CreatePost.class);
            startActivity(intent);
        });
    }
}