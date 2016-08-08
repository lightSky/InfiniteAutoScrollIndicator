package cn.lightsky.infiniteindicator;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import java.util.ArrayList;

import cn.light.sky.infiniteindicatordemo.R;
import cn.lightsky.infiniteindicator.page.OnPageClickListener;
import cn.lightsky.infiniteindicator.page.Page;

public class HeightWrapContentIndicatorActivity extends FragmentActivity implements OnPageClickListener {
    private InfiniteIndicator infiniteIndicator;
    private ArrayList<Page> pageViews;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_height_wrap_content_indicator);
        infiniteIndicator = (InfiniteIndicator) findViewById(R.id.infinite);
        initData();
        infiniteIndicator.setImageLoader(new PicassoLoader());
        infiniteIndicator.addPages(pageViews);
        infiniteIndicator.setPosition(InfiniteIndicator.IndicatorPosition.Center_Bottom);
    }

    private void initData() {
        pageViews = new ArrayList<>();
        pageViews.add(new Page("A ", "http://img11.360buyimg.com/da/jfs/t3151/255/89840682/98276/88fb2632/57a4448dNb812863d.jpg", this));
        pageViews.add(new Page("B ", "http://img10.360buyimg.com/da/jfs/t2680/205/3960149016/109520/65825f59/57a41481N56d451eb.jpg", this));
        pageViews.add(new Page("C ", "http://img12.360buyimg.com/da/jfs/t3304/276/99365143/154191/3932ab2/57a454cdN34812146.jpg", this));
        pageViews.add(new Page("D ", "http://img12.360buyimg.com/da/jfs/t3238/85/82368555/91239/bf6c7c48/57a43a0cNb4162052.jpg", this));

    }

    @Override
    public void onPageClick(int position, Page page) {

    }
}
