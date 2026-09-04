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
import jp.ac.meijou.android.a20260903teamwork.databinding.ActivitySearchResultBinding;

public class SearchResult extends AppCompatActivity {

    private ActivitySearchResultBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivitySearchResultBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // 【演習1】明示的Intent：起動先Activityのクラスを直接指定して遷移する
        // new Intent(コンテキスト, 起動先Activity.class) の形で Intent オブジェクトを作成する
        // ユーザー登録画面への遷移
        binding.userRegistrationButton.setOnClickListener(view -> {
            var intent = new Intent(this, UserRegistration.class);
            startActivity(intent);
        });
    }
}