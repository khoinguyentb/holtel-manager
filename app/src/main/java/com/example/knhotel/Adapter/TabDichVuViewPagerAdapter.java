package com.example.knhotel.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.knhotel.Fragment.FragmentDichVu;
import com.example.knhotel.Fragment.Fragment_don_dich_vu;

public class TabDichVuViewPagerAdapter extends FragmentStateAdapter  {
    public TabDichVuViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment = null;
        switch (position){
            case 0:
                return new Fragment_don_dich_vu();
            case 1:
                return new FragmentDichVu();

        }
        return fragment;

    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
