package com.example.sch.myapplication;

import android.app.Activity;
import android.os.Bundle;

import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.Gson;
import okhttp3.*;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class MainActivity extends Activity {
//    private String is;
//    private PageRecyclerView mRecyclerView = null;
//    private List<HomePagerBean.ResultBean.MenuBean> dataList = null;
//    private PageRecyclerView.PageAdapter myAdapter = null;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        setContentView(R.layout.activity_main);
//
//        initData();
//
//        mRecyclerView = (PageRecyclerView) findViewById(R.id.cusom_swipe_view);
//
//        // 设置行数和列数
//        mRecyclerView.setPageSize(1, 2);
//        // 设置页间距
//        mRecyclerView.setPageMargin(30);
//        // 设置数据
//        mRecyclerView.setAdapter(myAdapter = mRecyclerView.new PageAdapter(dataList, new PageRecyclerView.CallBack() {
//            @Override
//            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//                View view = LayoutInflater.from(MainActivity.this).inflate(R.layout.item, parent, false);
//                return new MyHolder(view);
//            }
//
//            @Override
//            public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
//                Log.d("moxun", "onBindViewHolder: "+dataList.size());
//                ((MyHolder) holder).tv.setText(dataList.get(position).getTitle());
//            }
//
//            @Override
//            public void onItemClickListener(View view, int position) {
//                Toast.makeText(MainActivity.this, "点击："
//                        + dataList.get(position), Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onItemLongClickListener(View view, int position) {
//                Toast.makeText(MainActivity.this, "删除："
//                        + dataList.get(position), Toast.LENGTH_SHORT).show();
//                myAdapter.remove(position);
//            }
//        }));
//                // 设置指示器
//        mRecyclerView.setIndicator((PageIndicatorView) findViewById(R.id.indicator));
//
//    }
//    /**
//     * 上传文件及参数
//     */
//    private void sendMultipart() {
//        File sdcache = getExternalCacheDir();
//        int cacheSize = 10 * 1024 * 1024;
//        //设置超时时间及缓存
//        OkHttpClient.Builder builder = new OkHttpClient.Builder()
//                .connectTimeout(15, TimeUnit.SECONDS)
//                .writeTimeout(20, TimeUnit.SECONDS)
//                .readTimeout(20, TimeUnit.SECONDS);
//        OkHttpClient mOkHttpClient = builder.build();
//
//
//        MediaType mediaType = MediaType.parse("application/json");
////使用JSONObject封装参数
//        JSONObject jsonObject = new JSONObject();
//        try {
//            jsonObject.put("app_user_id", 0);
//            jsonObject.put("token", "");
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
////创建RequestBody对象，将参数按照指定的MediaType封装
//        RequestBody requestBody = RequestBody.create(mediaType, jsonObject.toString());
//        Request request = new Request
//                .Builder()
//                .post(requestBody)//Post请求的参数传递
//                .url("http://www.yingzhiyunwenhua.cn/yzy/app/getIndexData")
//                .build();
////        try {
////            Response response = mOkHttpClient.newCall(request).execute();
////            String result = response.body().string();
////            SharedPreferenceUtils.setHuancun(result);
////            response.body().close();
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
//        mOkHttpClient.newCall(request).enqueue(new Callback() {
//            @Override
//            public void onFailure(@NotNull Call call, IOException e) {
//
//            }
//
//            @Override
//            public void onResponse(Call call, @NotNull Response response) throws IOException {
//                HomePagerBean homePagerBean = new Gson().fromJson(response.body().string(), HomePagerBean.class);
//                dataList.addAll(homePagerBean.getResult().getMenu());
//            }
//        });
//    }
//    private void initData() {
//        dataList = new ArrayList<>();
//        sendMultipart();
//    }
//
//    public class MyHolder extends RecyclerView.ViewHolder {
//
//        public TextView tv = null;
//
//        public MyHolder(View itemView) {
//            super(itemView);
//            tv = (TextView) itemView.findViewById(R.id.text);
//        }
//    }
int width;
    int screenWidth;
    List<String> data = new ArrayList<>();

    {
        for (int i = 1; i <= 17; i++) {
            data.add(i + "");
        }


    }

    PageGridView pageGridView,pageGridView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        pageIndicator= (MyPageIndicator) findViewById(R.id.pageindicator);
        width = getResources().getDisplayMetrics().widthPixels / 2;
        screenWidth = getResources().getDisplayMetrics().widthPixels;
        pageGridView = (PageGridView) findViewById(R.id.pagingGridView);
//        pageGridView2 = (PageGridView) findViewById(R.id.pagingGridView2);
        pageGridView3 = (PageGridView) findViewById(R.id.pagingGridView3);

        MyAdapter adapter1 = new MyAdapter(data);
        MyAdapter adapter2 = new MyAdapter(data);
        MyAdapter adapter3 = new MyAdapter(data);
        pageGridView.setAdapter(adapter1);
//        pageGridView2.setAdapter(adapter2);
        pageGridView3.setAdapter(adapter3);
        pageGridView.setOnItemClickListener(adapter1);
//        pageGridView2.setOnItemClickListener(adapter2);
        pageGridView3.setOnItemClickListener(adapter3);

        //设置分页指示器
//        pageGridView2.setPageIndicator(pageIndicator);

    }


    public class MyAdapter extends PageGridView.PagingAdapter<MyVH> implements PageGridView.OnItemClickListener {
        List<String> mData = new ArrayList<>();

        public MyAdapter(List<String> data) {
            this.mData.addAll(data);
        }

        @Override
        public MyVH onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(MainActivity.this).inflate(R.layout.layout_item, parent, false);
            ViewGroup.LayoutParams params = view.getLayoutParams();
            params.height = width;
            params.width = width;
            view.setLayoutParams(params);
            return new MyVH(view);
        }

        @Override
        public void onBindViewHolder(MyVH holder, int position) {
            if(TextUtils.isEmpty(mData.get(position))){
                holder.icon.setVisibility(View.GONE);
            }else{
                holder.icon.setVisibility(View.VISIBLE);
            }
            holder.tv_title.setText(mData.get(position));
        }

        @Override
        public int getItemCount() {
            return mData.size();
        }

        @Override
        public List getData() {
            return mData;
        }

        @Override
        public Object getEmpty() {
            return "";
        }

        @Override
        public void onItemClick(PageGridView pageGridView, int position) {
            String gridview = "";
            if (pageGridView == pageGridView) {
                gridview = "第一个GridView";
            }
//            if (pageGridView == pageGridView2) {
//                gridview = "第二个GridView";
//            }
            if (pageGridView == pageGridView3) {
                gridview = "第三个GridView";
            }

            Toast.makeText(MainActivity.this, gridview + " 第" + (position + 1) + "个item 被点击" + " 值：" + mData.get(position), Toast.LENGTH_SHORT).show();
        }
    }

    public static class MyVH extends RecyclerView.ViewHolder {
        public TextView tv_title;
        public ImageView icon;
        public MyVH(View itemView) {
            super(itemView);
            tv_title = (TextView) itemView.findViewById(R.id.tv_title);
            icon= (ImageView) itemView.findViewById(R.id.icon);
        }
    }

    int scrollX = 0;
    boolean isAuto = false;
    int Target = 0;

    public class MyScrollListener extends RecyclerView.OnScrollListener {


        @Override
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            Log.i("zzz", "onScrollStateChanged state=" + newState + " isAuto=" + isAuto);
            // recyclerView.smoothScrollBy(10,0);
            if (newState == 0) {
                if (!isAuto) {
                    int p = scrollX / screenWidth;
                    int offset = scrollX % screenWidth;
                    if (offset > screenWidth / 2) {
                        p++;
                    }
                    Target = p * screenWidth;
                    isAuto = true;
                    recyclerView.smoothScrollBy(Target - scrollX, 0);
                }
            } else if (newState == 2) {
                isAuto = false;
            }

        }

        @Override
        public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
            scrollX += dx;
            Log.i("zzz", "onScrolled dx=" + dx + " scrollX=" + scrollX);
        }

    }
}