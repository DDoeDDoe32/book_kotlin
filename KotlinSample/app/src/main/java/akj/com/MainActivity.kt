package akj.com

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 레이아웃에 button 이라는 ID로 선언된 뷰에 클릭 이벤트 리스너를 등록한다.
        button1.setOnClickListener {
            // 버튼이 클릭되었을 때의 코드 작성
        }
    }
}