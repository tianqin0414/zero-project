package com.macro.mall.tiny.controller;

import com.macro.mall.tiny.common.api.CommonPage;
import com.macro.mall.tiny.common.api.CommonResult;
import com.macro.mall.tiny.mbg.model.PmsBrand;
import com.macro.mall.tiny.service.PmsBrandService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * 品牌管理Controller
 * Created by macro on 2019/4/19.
 */
@Api(tags = "UmsAdminController", description = "商品品牌管理aa")
@Controller
@RequestMapping("v1/abrand")
public class UmsAdminController {
    @Autowired
    private PmsBrandService brandService;

    private static final Logger LOGGER = LoggerFactory.getLogger(PmsBrandController.class);


    @ApiOperation("aa删除指定id的品牌")
    @RequestMapping(value = "/adelete/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult deleteBrand(@PathVariable("id") Long id) {
        int count = brandService.deleteBrand(id);
        if (count == 1) {
            LOGGER.debug("deleteBrand success :id={}", id);
            return CommonResult.success(null);
        } else {
            LOGGER.debug("deleteBrand failed :id={}", id);
            return CommonResult.failed("操作失败");
        }
    }
//
//    @ApiOperation("分页查询品牌列表")
//    @RequestMapping(value = "/list", method = RequestMethod.GET)
//    @ResponseBody
//    public CommonResult<CommonPage<PmsBrand>> listBrand(@RequestParam(value = "pageNum", defaultValue = "1")
//                                                        @ApiParam("页码") Integer pageNum,
//                                                        @RequestParam(value = "pageSize", defaultValue = "3")
//                                                        @ApiParam("每页数量") Integer pageSize) {
//        List<PmsBrand> brandList = brandService.listBrand(pageNum, pageSize);
//        return CommonResult.success(CommonPage.restPage(brandList));
//    }
//
//    @ApiOperation("获取指定id的品牌详情")
//    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
//    @ResponseBody
//    public CommonResult<PmsBrand> brand(@PathVariable("id") Long id) {
//        return CommonResult.success(brandService.getBrand(id));
//    }
}
