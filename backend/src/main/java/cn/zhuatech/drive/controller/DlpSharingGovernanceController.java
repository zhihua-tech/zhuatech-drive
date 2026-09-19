/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
package cn.zhuatech.drive.controller;
import cn.zhuatech.drive.common.ApiResponse;
import cn.zhuatech.drive.service.DlpSharingGovernanceService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
/**
 * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
 */
@RestController @RequestMapping("/api/enterprise/drive")
public class DlpSharingGovernanceController {
    private final DlpSharingGovernanceService service;
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    public DlpSharingGovernanceController(DlpSharingGovernanceService service) { this.service = service; }
    /**
     * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
     */
    @PostMapping("/sharing-governance")
    public ApiResponse<DlpSharingGovernanceService.Result> evaluate(@Valid @RequestBody DlpSharingGovernanceService.Request request) {
        return ApiResponse.ok(service.evaluate(request));
    }
}
