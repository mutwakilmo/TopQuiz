package com.mutwakilmo.android.topquiz.model;

import java.util.Collections;
import java.util.List;

/**
 * Created by Mutwakil Mo on ${Date}
 */
public class QuestionBank {
    private List<Question> mQuestionList;
    private int mNextQuestionIndex;


    public QuestionBank(List<Question> questionList) {
        // Shuffle the question list before storing it
        mQuestionList = questionList;

        // Shuffle the question list
        Collections.shuffle(mQuestionList);

        mNextQuestionIndex = 0;
    }

    public Question getQuestion() {
        // Loop over the questions and return a new one at each call
        if (mNextQuestionIndex == mQuestionList.size()){
            mNextQuestionIndex = 0;
        }
        // please note the post-Incrementation
        return mQuestionList.get(mNextQuestionIndex++);
    }
}
