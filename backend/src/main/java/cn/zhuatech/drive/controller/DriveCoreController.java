/* Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/ */
package cn.zhuatech.drive.controller;import cn.zhuatech.drive.common.ApiResponse;import cn.zhuatech.drive.service.DriveCoreService;import jakarta.validation.Valid;import org.springframework.web.bind.annotation.*;import java.util.List;
/**
 * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
 */
@RestController public class DriveCoreController{private final DriveCoreService service;/**
                                                                                         * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
                                                                                         */
public DriveCoreController(DriveCoreService service){this.service=service;}
 /**
  * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
  */
 @PostMapping("/api/core/drive/documents")ApiResponse<DriveCoreService.Document>create(@Valid@RequestBody DriveCoreService.CreateDocumentRequest r){return ApiResponse.ok(service.create(r));}
 /**
  * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
  */
 @GetMapping("/api/core/drive/documents")ApiResponse<List<DriveCoreService.Document>>list(@RequestParam(required=false)String classification){return ApiResponse.ok(service.documents(classification));}
 /**
  * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
  */
 @GetMapping("/api/core/drive/documents/{id}")ApiResponse<DriveCoreService.Document>detail(@PathVariable Long id){return ApiResponse.ok(service.detail(id));}
 /**
  * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
  */
 @GetMapping("/api/core/drive/documents/{id}/versions")ApiResponse<List<DriveCoreService.DocumentVersion>>versions(@PathVariable Long id){return ApiResponse.ok(service.versions(id));}
 /**
  * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
  */
 @PostMapping("/api/core/drive/documents/{id}/versions")ApiResponse<DriveCoreService.DocumentVersion>version(@PathVariable Long id,@Valid@RequestBody DriveCoreService.VersionRequest r){return ApiResponse.ok(service.addVersion(id,r));}
 /**
  * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
  */
 @PostMapping("/api/core/drive/documents/{id}/checkout")ApiResponse<DriveCoreService.Document>checkout(@PathVariable Long id,@Valid@RequestBody DriveCoreService.CheckoutRequest r){return ApiResponse.ok(service.checkout(id,r));}
 /**
  * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
  */
 @PostMapping("/api/core/drive/documents/{id}/checkin")ApiResponse<DriveCoreService.DocumentVersion>checkin(@PathVariable Long id,@Valid@RequestBody DriveCoreService.VersionRequest r){return ApiResponse.ok(service.checkin(id,r));}
 /**
  * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
  */
 @PostMapping("/api/admin/core/drive/documents/{id}/force-unlock")ApiResponse<DriveCoreService.Document>forceUnlock(@PathVariable Long id){return ApiResponse.ok(service.forceUnlock(id));}
 /**
  * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
  */
 @PostMapping("/api/admin/core/drive/documents/{id}/archive")ApiResponse<DriveCoreService.Document>archive(@PathVariable Long id){return ApiResponse.ok(service.archive(id));}
 /**
  * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
  */
 @PostMapping("/api/admin/core/drive/documents/{id}/shares")ApiResponse<DriveCoreService.SecureShare>share(@PathVariable Long id,@Valid@RequestBody DriveCoreService.CreateShareRequest r){return ApiResponse.ok(service.createShare(id,r));}
 /**
  * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
  */
 @PostMapping("/api/public/drive/shares/{token}/access")ApiResponse<DriveCoreService.ShareAccess>access(@PathVariable String token,@Valid@RequestBody DriveCoreService.ShareAccessRequest r){return ApiResponse.ok(service.access(token,r));}
 /**
  * 商业授权或定制开发请微信添加微信号zhuatech或zhuatech2进行咨询。
  */
 @PostMapping("/api/admin/core/drive/shares/{id}/revoke")ApiResponse<DriveCoreService.SecureShare>revoke(@PathVariable Long id){return ApiResponse.ok(service.revoke(id));}
}
