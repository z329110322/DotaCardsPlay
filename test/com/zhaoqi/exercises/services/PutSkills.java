package com.zhaoqi.exercises.services;


import com.zhaoqi.common.dotaInterface.common.SkillEffectObject;
import com.zhaoqi.common.model.skill.HeroSkill;

/**
 * Created by zhaoqi on 2016/4/27.
 */
public interface PutSkills {
    // 释放技能
    public void putSkills(SkillEffectObject source, HeroSkill skill, SkillEffectObject target);
}
