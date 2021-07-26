package com.example.local_image_controller_final_project_backend.service;

import com.example.local_image_controller_final_project_backend.model.ImageModel;
import com.example.local_image_controller_final_project_backend.repository.ImageModelRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageModelService  {
    /**ImageModelService responsible for CRUD operations with data about image files
    */
    private final ImageModelRepository imageModelRepository;

    public ImageModelService(ImageModelRepository imageModelRepository) {
        this.imageModelRepository = imageModelRepository;
    }

    public void saveImageDataToDB(ImageModel imageModel) {
        imageModelRepository.save(imageModel);
    }

    public List<ImageModel> getAllImagesData() {
        return imageModelRepository.findAll();
    }

    public void deleteImageFromDB(Long imageId) {
        imageModelRepository.deleteById(imageId);
    }

    public ImageModel getImageModelById(Long id) {
        return imageModelRepository.findById(id).orElse(null);
    }
}
