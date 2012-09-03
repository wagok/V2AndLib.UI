/*
 * Copyright (C) 2012 V.Shcryabets (vshcryabets@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.v2soft.V2AndLib.demoapp.ui.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.v2soft.AndLib.ui.fragments.BaseDialogFragment;
import com.v2soft.V2AndLib.demoapp.DemoAppSettings;
import com.v2soft.V2AndLib.demoapp.DemoApplication;
import com.v2soft.V2AndLib.demoapp.R;

/**
 * 
 * @author vshcryabets@gmail.com
 *
 */
public class DemoDialogEditString 
extends BaseDialogFragment<DemoApplication, DemoAppSettings>  {
    private final static String EXTRA_SOURCE = "source";
    private String mResult;
    private EditText mEdit;
    
    public static BaseDialogFragment<DemoApplication, DemoAppSettings> newInstance(String source) {
        final BaseDialogFragment<DemoApplication, DemoAppSettings> fragment = new DemoDialogEditString();
        final Bundle bundle = new Bundle();
        bundle.putString(EXTRA_SOURCE, source);
        fragment.setArguments(bundle);
        return fragment;
    }
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        if ( savedInstanceState != null ) {
            mResult = savedInstanceState.getString(EXTRA_SOURCE);
        } else {
            mResult = getArguments().getString(EXTRA_SOURCE);
        }
        super.onCreate(savedInstanceState);
    }
    
    @Override
    public void onSaveInstanceState(Bundle outState) {
        mResult = 
        outState.putString(key, value)
        super.onSaveInstanceState(outState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        final View view = inflater.inflate(com.v2soft.AndLib.ui.R.layout.v2andlib_fragment_dialog_string, null);
        mEdit = (EditText) view.findViewById(R.id.v2andlib_edit);
        edit.setText(mResult);
        registerOnClickListener(new int[]{R.id.v2andlib_cancel, R.id.v2andlib_cancel}, view);
        return view;
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
        case R.id.v2andlib_ok:
            break;
        case R.id.v2andlib_cancel:
            dismiss();
            break;

        default:
            break;
        }
    }
}
