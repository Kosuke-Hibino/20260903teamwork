package jp.ac.meijou.android.a20260903teamwork;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

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

        List<SerachItem> items = new ArrayList<>();
        items.add(new SerachItem(
                R.drawable.top1,
                R.drawable.user1,
                "Aさん",
                "123"
        ));
        items.add(new SerachItem(
                R.drawable.top2,
                R.drawable.user2,
                "Bさん",
                "ABC"
        ));

        RecyclerView  recyclerView = findViewById(R.id.main);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        SearchAdapter adapter = new SearchAdapter(items);
        recyclerView.setAdapter(adapter);

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